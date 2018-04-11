using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Demo2.DataAccess;
using Demo2.Models;
using Demo2.Repository;

namespace Demo2.ViewModels
{
    public class MainWindowViewModel
    {
        public MainWindowViewModel(
            ITeacherRepository teacherRepository)
        {
                Teachers = teacherRepository.GetTeachers();
        }
        public List<Teacher> Teachers { get; set; }
    }
}
