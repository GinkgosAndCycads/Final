import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

//Instantiate Array
public class Sorting extends javax.swing.JFrame {
    DefaultListModel model;
    int nums[] = new int[100000];
    
    public Sorting() {
        initComponents();
        model = new DefaultListModel();      
        lstnums.setModel(model);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstnums = new javax.swing.JList();
        btngennum = new javax.swing.JButton();
        btnbub = new javax.swing.JButton();
        btnsel = new javax.swing.JButton();
        btnin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnrec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstnums);

        btngennum.setText("Generate Numbers");
        btngennum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngennumActionPerformed(evt);
            }
        });

        btnbub.setText("Bubble");
        btnbub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbubActionPerformed(evt);
            }
        });

        btnsel.setText("Selection");
        btnsel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselActionPerformed(evt);
            }
        });

        btnin.setText("Insertion");
        btnin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninActionPerformed(evt);
            }
        });

        jLabel1.setText("String Methods");

        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnrec.setText("Recursive");
        btnrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btngennum, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnbub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsel, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(btnin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnrec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btngennum)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbub)
                        .addGap(18, 18, 18)
                        .addComponent(btnsel)
                        .addGap(18, 18, 18)
                        .addComponent(btnin)
                        .addGap(18, 18, 18)
                        .addComponent(btnrec)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngennumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngennumActionPerformed
        // TODO add your handling code here: 
        //Generate numbers
        model.clear();
        for(int x=0; x<nums.length;x++){
            nums[x]=(int)(Math.random()*100000)+1;
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btngennumActionPerformed

    private void btnbubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubActionPerformed
        // TODO add your handling code here: 
        //bubble sort
        model.clear();
        double stime = System.currentTimeMillis();
        bubbleSort(nums);
        double etime = System.currentTimeMillis()-stime;
        JOptionPane.showMessageDialog(this, "Time it Took: " +etime);
        for(int x=0; x<nums.length; x++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btnbubActionPerformed

    private void btnselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselActionPerformed
        // TODO add your handling code here: 
        //Selection sort
        model.clear();
        double stime = System.currentTimeMillis();
        selectionSort(nums);
        double etime = System.currentTimeMillis()-stime;
        JOptionPane.showMessageDialog(this, "Time it Took: " +etime);
        for(int x=0; x<nums.length; x++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btnselActionPerformed

    private void btninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninActionPerformed
        // TODO add your handling code here: 
        //Insertion sort
        model.clear();
        double stime = System.currentTimeMillis();
        insertionSort(nums);
        double etime = System.currentTimeMillis()-stime;
        JOptionPane.showMessageDialog(this, "Time it Took: " +etime);
        for(int x=0; x<nums.length; x++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btninActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecActionPerformed
        // TODO add your handling code here: 
        //Recursion Sort
         model.clear();
        double stime = System.currentTimeMillis();
        recursiveSort(nums, 0, nums.length-1);
        double etime = System.currentTimeMillis()-stime;
        JOptionPane.showMessageDialog(this, "Time it Took: " +etime);
        for(int x=0; x<nums.length; x++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btnrecActionPerformed
    public static void bubbleSort(int[] a){
   	int k = 0;
   	boolean exchangeMade = true;
	// Make up to n - 1 passes through array, exit 
	//early if no exchanges are made on previous pass 
        while ((k < a.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < a.length - k; j++)  
         		if (a[j] > a[j + 1]){
            			swap(a, j, j + 1);		 
            			exchangeMade = true;
         		}//end if
		}//end for
	}//end while


//supporting swap method

       


////////////////////////////////////////////////////////////////

public static void selectionSort(int[] a){
   for (int i = 0; i < a.length - 1; i++){
      int minIndex = findMinimum(a, i);
      if (minIndex != i)
	//if lowest is not already in place
         swap(a, i, minIndex);
   } //end for
}  

//supporting findMinimum method

public static int findMinimum(int[] a, int first){
   //first=where to start looking from
   //assume first is also the smallest for now
   int minIndex = first; 
   for (int i = first + 1; i < a.length; i++)
      if (a[i] < a[minIndex])
         minIndex = i;
   return minIndex;
}

//supporting swap method (same as bubble sort swap)

public static void swap(int[] a, int x, int y){
   int temp = a[x];
   a[x] = a[y];
   a[y] = temp;
}


/////////////////////////////////////////////////////////////

public static void insertionSort(int a[]){
	int itemToInsert, j;
	boolean stillLooking;

	//on the kth pass, pass item k upwards in list
	//and insert it in its proper place amoung the
	//first k entries in an array

	for (int k=1; k<a.length; k++){
	//move backwards through list, looking for
	//the right place to insert a[k];
		itemToInsert = a[k];
		j=k-1;
		stillLooking=true;
		while(j >=0 && stillLooking){
			if (itemToInsert < a[j]){
				//move item higher
				a[j+1] = a[j];
				j--;
			}else{
				//we have found new home for a[k];
				stillLooking=false;
			}//end else// j+1 is where the item goes
			a[j+1]=itemToInsert;
		}//end while
  	}//end for
}//end method
private static void recursiveSort(int[] a, int left, int right) {
		if(left>=right)return;
		int i = left;
		int j = right;
		int pivotValue = a [(left + right)/2];
		while(i<j){
			while (a[i]<pivotValue)i++;
			while (pivotValue<a[j])j--;
			if(i<=j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		recursiveSort(a,left,j);
		recursiveSort(a,i,right);
	}

    
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbub;
    private javax.swing.JButton btngennum;
    private javax.swing.JButton btnin;
    private javax.swing.JButton btnrec;
    private javax.swing.JButton btnsel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstnums;
    // End of variables declaration//GEN-END:variables

   
}
