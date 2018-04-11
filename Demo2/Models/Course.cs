using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo2.Models
{
    public class Course
    {
        public int Id { get; set; }

        public string Name { get; set; }

        public Teacher Teacher { get; set; }

        //public int TeacherId { get; set; }
    }
}
