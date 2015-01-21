(ns me.chptx.reagent-bs.macros)

(def bs-classes
  '[Button
    Input
    Pannel
    Glyphicon])

(defn bsreact-import [tname]
  `(def ~tname (aget js/ReactBootstrap ~(name tname))))

(defmacro export-bs-react-classes []
  `(do ~@(map bsreact-import bs-classes)))

