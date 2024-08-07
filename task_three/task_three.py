import pandas as pd

data = r'C:\Users\Islam\Desktop\vois_task\Employees.csv'
df = pd.read_csv(data)
print(data)

# - Remove any duplicates in the table
df = df.drop_duplicates()

# Remove any decimal places in the Age column
df['Age'] = df['Age'].astype(int)

# Convert the USD salary to EGP that equal 50 
exchange_rate = 50
df['Salary(EGP)'] = df['Salary(USD)'] * exchange_rate

# Print in the console some stats like:
	#- Average age
	#- Median Salaries
	#- Ration between males and female employees

average_age = df['Age'].mean()
median_salary_usd = df['Salary(USD)'].median()
median_salary_egp = df['Salary(EGP)'].median()
gender_counts = df['Gender'].value_counts()
male_to_female_ratio = gender_counts['M'] / gender_counts['F']

# Print the statistics
print(f"Average Age: {average_age:.2f}")
print(f"Median Salary (USD): {median_salary_usd}")
print(f"Median Salary (EGP): {median_salary_egp}")
print(f"Ratio between Male and Female Employees: {male_to_female_ratio:.2f}")

# After performing the previous steps, write the data in a new CSV file
output_path = r'C:\Users\Islam\Desktop\vois_task\tasks\task_three\cleaned_data.csv'
df.to_csv(output_path, index=False)

print(f"Cleaned data has been written to {output_path}")
