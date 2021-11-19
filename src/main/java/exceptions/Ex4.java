package exceptions;
 import java.io.IOException;
 class PrintingDaemon {
 private boolean checkContents(String file){
 boolean wrongFile = true;
 // valid file-checking code
 return wrongFile;
 }
 public void printFile(String file) throws IOException {
 if (checkContents(file)) throw new IOException();
         else { /* valid file-printing code */ }
         }
  }
  public class Ex4 {
  public static void main(String[] args) throws Exception {
         PrintingDaemon pd = new PrintingDaemon();
         pd.printFile(args[0]);
         }
  }

      /**Which two modifications, when used together, will make the code compile?
      +++  A. Add throws Exception to the main() method’s signature on line 15
        B. Replace line 17 with:
        try {
        pd.printFile(args[0]);
        }
        catch(Exception e) { }
        catch(IOException ioe) { }
        +++C. Add throws IOException to the printFile() method’s signature on line 9
        D. Replace line 10 with
        if (checkContents(file)) throw new IOException("Exception raised");
        E. Replace line 18 with
        throw new IOException(); */
