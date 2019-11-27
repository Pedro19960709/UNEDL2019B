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

        private void aboutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            About about = new About();
            about.MdiParent = this;
            about.Show();

        }

        private void printHelperToolStripMenuItem_Click(object sender, EventArgs e)
        {
            PrintHelper ph = new PrintHelper();
            ph.MdiParent = this;
            ph.Show();
        }

        private void registroToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Registro rg = new Registro();
            rg.MdiParent = this;
            rg.Show();
        }
    }
}
