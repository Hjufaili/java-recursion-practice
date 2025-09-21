
import java.io.File;

class TaskTwelve {
       /* public File findFileByName(File rootDir, String fileName) {
            if (rootDir == null || !rootDir.isDirectory()) {
                return null;
            }
            return searchInDirectory(rootDir, fileName);
        }

        private File searchInDirectory(File dir, String fileName) {
            File[] files = dir.listFiles();
            if (files == null) {
                return null;
            }
            return searchFiles(files, 0, fileName);
        }

        private File searchFiles(File[] files, int index, String fileName) {
            if (index >= files.length) {
                return null;
            }

            File currentFile = files[index];

            if (!currentFile.isDirectory() && currentFile.getName().equals(fileName)) {
                return currentFile;
            }

            if (currentFile.isDirectory()) {
                File foundInSubdir = searchInDirectory(currentFile, fileName);
                if (foundInSubdir != null) {
                    return foundInSubdir;
                }
            }

            return searchFiles(files, index + 1, fileName);
        }




        class FileFinder {
        */


    public File findFileByName(File rootDir, String fileName) {
        if (!rootDir.isDirectory()) {
            return null;
        }

        File[] files = rootDir.listFiles();
        if (files == null) {
            return null;
        }

        return findFileByNameRecursive(files, fileName, 0);
    }


    private File findFileByNameRecursive(File[] files, String fileName, int index) {
        if (index >= files.length) {
            return null;
        }

        File current = files[index];

        if (current.isFile() && current.getName().equals(fileName)) {
            return current;
        }

        if (current.isDirectory()) {
            File result = findFileByName(current, fileName);
            if (result != null) {
                return result;
            }
        }

        return findFileByNameRecursive(files, fileName, index + 1);
    }

    public static void main(String[] args) {
        TaskTwelve finder = new TaskTwelve();

        String rootPath = "D:\\";
        String targetFileName = "TaskOne.java";

        System.out.println("🔍 Searching for file: " + targetFileName);
        System.out.println("📂 Starting from directory: " + new File(rootPath).getAbsolutePath());

        File result = finder.findFileByName(new File(rootPath), targetFileName);

        if (result != null) {
            System.out.println("✅ File found: " + result.getAbsolutePath());
        } else {
            System.out.println("❌ File not found: " + targetFileName);
        }
    }


}




