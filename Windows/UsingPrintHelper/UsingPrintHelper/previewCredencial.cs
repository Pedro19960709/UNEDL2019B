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
    public partial class previewCredencial : Form
    {
        public previewCredencial()
        {
            InitializeComponent();
        }

        public previewCredencial(String nom,String mat,String gra,String gru,String tall)
        {
            InitializeComponent();
            lblCredencial.Text = "Tu credencial es: \n\n\t"+nom+"\n\n\t"+mat+"\n\n\t" + gra + "\n\n\t" + gru +"\n\n\t"+tall;


        }

        private void previewCredencial_Load(object sender, EventArgs e)
        {

        }

        private void btnRegresar_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
