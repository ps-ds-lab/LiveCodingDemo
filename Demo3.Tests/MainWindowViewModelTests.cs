using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Demo2.Models;
using Demo2.Repository;
using Demo2.ViewModels;
using NUnit.Framework;

namespace Demo3.Tests
{
    [TestFixture]
    public class MainWindowViewModelTests
    {
        [Test]
        public void BasicMath()
        {
            var teachers = new List<Teacher>
            {
                new Teacher {Name = "t1"},
                new Teacher {Name = "t2"}
            };
            var vm = new MainWindowViewModel(new TestTeacherRepository(teachers));
            
            CollectionAssert.AreEqual(
                teachers, vm.Teachers);
        }

        class TestTeacherRepository : ITeacherRepository
        {
            private readonly List<Teacher> _teachers;

            public TestTeacherRepository(List<Teacher> teachers)
            {
                _teachers = teachers;
            }
            public List<Teacher> GetTeachers()
            {
                return _teachers;
            }
        }
    }
}
