Here are the tests on the native SQLite version 3.6.11.

They are necessary because we need to confirm our test results in comparison with the results of these tests 
in their native environment. 

This is Eclipe CDT project and includes in archive 'tsrc.tar.gz' a copy of SQLite sources, except for some files 
(which break build).

To build and execute tests you want to copy the directory 'sqlite_test' somewhere outside SQLJet project, 
uncompress archive 'tsrc.tar.gz' and open it as a CDT project.

They have not been executed in SQLJet build and have been commited only for distribution. If necessary they 
should be built and executed manually.


Sergey Scherbina 
sergey.scherbina@gmail.com  