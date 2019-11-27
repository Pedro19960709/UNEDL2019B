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
    public partial class Registro : Form
    {
        public Registro()
        {
            InitializeComponent();
        }

        private void lblNombre_Click(object sender, EventArgs e)
        {

        }

        private void Registro_Load(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
            String nom = txtNombre.Text;
            String mat = txtMatricula.Text;
            String gra = txtGrado.Text;
            String gru = txtGrupo.Text;
            String tall = txtTaller.Text;
            previewCredencial pc = new previewCredencial(nom, mat, gra, gru, tall);
            pc.Show();

        }
    }
}
