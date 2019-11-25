using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace UsingPrintHelper
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void operationsToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void abautToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AboutBox1 about = new AboutBox1();
            about.MdiParent = this;
            about.Show();
        }

        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void printHelperToolStripMenuItem_Click(object sender, EventArgs e)
        {
            PrintHelper printHelper = new  PrintHelper();
            printHelper.Show();

        }
    }
}
