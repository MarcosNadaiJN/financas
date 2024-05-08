import { Route, Routes } from "react-router-dom";
import Home from "./pages/home/Home";
import PessoaForm from "./pages/cadastros/pessoa/PessoaForm";

export default function AppRoutes() {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/pessoa/new" element={<PessoaForm />} />
    </Routes>
  );
}
