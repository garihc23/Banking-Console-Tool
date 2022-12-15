===============================================================================

Banking Console Tool
--------------------------------------------------------------------------------
In this task you have to develop a banking console tool in any programming language of your interest.
This tool will generate a file where the previous 5 transactions of the user are printed in a mini statement
file. The generated file will be in .csv format. This tool will have the following features:

● Tool will generate a .csv formatted file in the current directory.

● Tool will take the user name and birth year as input.

● Tool will then generate the user_id as per the following example:


Name: Ryan Reynolds, Birth Year: 1976
user_id: RYA_REY_1976

● You can store dummy data of the transactions for the generation of files.

● The tool should fetch the previous 5 transactions of the user and generate the mini statement file.

● The file contents should be under the following headings:


S.N., Date, Time, Amount, Balance
followed by 5 rows of previous transactions

● The name of the file generated should be the same as the user_id.

● Tool should be easy to use.

Constraints:

● Current Balance in each transaction should match to its amount.

● You can’t use any third party packages, you have to use only inbuilt functions provided by the
programming language.

Scoring:

● Completion percentage

● Code quality

Bonus:

● Generate a template file and use it for generating mini statements file

● Error Handling

===============================================================================

## Folder Structure
-------------------------------------------------------------------------------
The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.
===============================================================================

## Dependency Management
-------------------------------------------------------------------------------
The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
===============================================================================
