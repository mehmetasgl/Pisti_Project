from os import system, remove, listdir

MANIFEST_NAME = "manifest.mf"
MANIFEST_CONTENT = "Manifest-Version: 1.0\nMain-Class: {}\n"

def compileCode(mainname):
    system(f"javac {mainname}.java")

def createTextFile(text):
    with open(MANIFEST_NAME, "w") as file:
        file.write(text)

def createJarFile(jarname):
    system(f"jar cfm {jarname}.jar {MANIFEST_NAME} *.class")

def deleteManifestFile():
    remove(MANIFEST_NAME)

def deleteCompileFiles():
    for file in listdir():
        if file.endswith(".class"):
            remove(file)

if __name__ == "__main__":
    jarname = input("Enter the jar name of your project: ")
    mainname = input("Enter the name of your main class: ")
    compileCode(mainname)
    createTextFile(MANIFEST_CONTENT.format(mainname))
    createJarFile(jarname)
    deleteManifestFile()
    deleteCompileFiles()
