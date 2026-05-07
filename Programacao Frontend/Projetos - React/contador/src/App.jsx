import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import Contador from './Contador'
import Saudacao from './Saudacao'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div>
      <h1>Meu primeiro react</h1>
      <div className="rowMain">
        <Contador />
        <Saudacao />
      </div>
    </div>
  )
}

export default App
