from fpdf import FPDF

class PDF(FPDF):
    def header(self):
        self.set_font('Arial', 'B', 12)
        self.cell(0, 10, 'Bruck Urgessa Mulissa - Curriculum Vitae', 0, 1, 'C')
        self.ln(5)

    def chapter_title(self, title):
        self.set_font('Arial', 'B', 12)
        self.cell(0, 10, title, 0, 1, 'L')
        self.ln(3)

    def chapter_body(self, body):
        self.set_font('Arial', '', 11)
        self.multi_cell(0, 10, body)
        self.ln()

    def add_section(self, title, body):
        self.chapter_title(title)
        self.chapter_body(body)


pdf = PDF()
pdf.set_auto_page_break(auto=True, margin=15)
pdf.add_page()

# Contact Information
pdf.add_section("Contact Information", 
    "Phone: +46 764 098 322\nEmail: abcdebruck@gmail.com")

# Professional Summary
summary = (
    "Azure Architect and Cloud Solutions Engineer with over 10 years of expertise in "
    "software development, data engineering, and cloud infrastructure. Specializes in Microsoft Azure "
    "and AWS platforms, leveraging tools like Terraform, ARM templates, and Databricks to deliver secure, "
    "scalable, and cost-efficient cloud solutions. Proficient in designing CI/CD pipelines, automating workflows "
    "with Azure DevOps, and ensuring data security and governance. Recognized for driving efficiency and aligning "
    "cloud solutions with strategic business goals."
)
pdf.add_section("Professional Summary", summary)

# Education
education = (
    "Microsoft Azure Cloud Advisor – Edugrade AB (08/2020 – 08/2022)\n"
    "MSc in Computer and System Science – Stockholm University (08/2010 – 03/2014)\n"
    "MSc in Information Science – Addis Ababa University (05/2005 – 07/2007)\n"
    "BSc in Information Systems – Addis Ababa University (04/2002 – 06/2004)\n"
    "Advanced Diploma in Computer Science – HiLCoE School of Computer Science (01/2001 – 05/2002)\n"
    "Diploma in Business – Addis Ababa University of Commerce (09/1997 – 08/1999)\n"
    "AWS Certified Solutions Architect – Cloud Excellence Program (05/2019 – 03/2020)\n"
    "Swedish for Programmers – SFX-IT (05/2014 – 06/2015)"
)
pdf.add_section("Education", education)

# Certifications
certifications = (
    "Microsoft Azure Architect\n"
    "AWS Solutions Architect\n"
    "CCNA (Networking)\n"
    "Oracle Database Administrator (DBA)"
)
pdf.add_section("Certifications", certifications)

# Work Experience
experience = (
    "**Microsoft Azure Architect**\n"
    "Admas University | Stockholm, Sweden (June 2022 – September 2023)\n"
    "- Architected and implemented scalable Azure solutions using Logic Apps, Functions, and Terraform.\n"
    "- Developed CI/CD pipelines with Azure DevOps, streamlining deployments and improving release cycles.\n"
    "- Managed governance, compliance, and security for cloud infrastructures, reducing costs by 20%.\n"
    "- Enhanced scalability and reliability of Azure Virtual Machines and App Services.\n\n"
    "**Technical Project Consultant**\n"
    "Bsoft Development | Stockholm, Sweden (September 2014 – September 2018)\n"
    "- Delivered complex data integration projects using Databricks, BigQuery, and AWS.\n"
    "- Optimized system performance and reduced operational costs by 75%.\n"
    "- Led cross-functional teams, boosting user engagement by 40%.\n\n"
    "**Programmer & Quality Assurance Lead**\n"
    "ethioTelecom (October 2004 – September 2010)\n"
    "- Designed Java-based procurement and financial systems, resulting in significant operational improvements.\n"
    "- Developed machine learning-based customer retention models, increasing retention by 15%.\n"
    "- Prevented $300M in financial errors through precise quality assurance protocols.\n\n"
    "**Instructor in Software Engineering**\n"
    "Adama University (November 2004 – April 2005)\n"
    "- Mentored students in creating innovative technology solutions, including child immunization tracking systems."
)
pdf.add_section("Work Experience", experience)

# Core Skills
skills = (
    "Cloud Platforms: Microsoft Azure, AWS, GCP\n"
    "Data Engineering: Databricks, Apache Spark, PySpark, Delta Lake, Parquet\n"
    "Infrastructure as Code (IaC): Terraform, ARM templates\n"
    "DevOps: CI/CD pipelines, Azure DevOps, Jenkins, Git\n"
    "Programming: Python, Java (J2EE), SQL, REST APIs\n"
    "Security & Governance: Compliance, cost optimization, data security"
)
pdf.add_section("Core Skills", skills)

# Publications & Projects
projects = (
    "Azure Cloud Governance Research: Thesis on architecture compliance and optimization.\n"
    "Customer Retention CRM Project: Machine learning models increased customer retention by 15%.\n"
    "Procurement Management System: Reduced lead times with a Java-based solution.\n"
    "Data Pipeline Optimization: Enhanced ETL processes with Databricks and Apache Spark."
)
pdf.add_section("Publications & Projects", projects)

# Languages
languages = (
    "English: Fluent\n"
    "Swedish: Conversant\n"
    "Amharic: Native"
)
pdf.add_section("Languages", languages)

# References
references = (
    "Stefan Holmberg – IT Consultant\n"
    "Email: stefan.holmberg@systementor.se\n\n"
    "Nigatu Tikssay – Cloud Consultant\n"
    "Email: negatu@afriscanta.com"
)
pdf.add_section("References", references)

# Save PDF
file_path = "/mnt/data/Bruck_Urgessa_Mulissa_CV.pdf"
pdf.output(file_path)
file_path
