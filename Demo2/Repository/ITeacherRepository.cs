using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Demo2.Models;

namespace Demo2.Repository
{
    public interface ITeacherRepository
    {
        List<Teacher> GetTeachers();
    }
}
