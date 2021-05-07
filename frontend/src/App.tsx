import NavBar from "components/Navbar";
import Footer from "components/Footer";
import DataTable from "components/DataTable"

function App() {
  return (
    <>
      <NavBar></NavBar>
      <div className='container' >
        <h1 className='text-primary'>Olá mundo!!!</h1>
        <DataTable></DataTable>
      </div>

      <Footer></Footer>
    </>
  );
}

export default App;
