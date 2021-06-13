(ns dolce-vita.core)

(defmacro imply
  "`a --> b` as it is meant to be (false only if a is true and b false).
   Useful for pre- and post-conditions"
  [condition consequence]
  `(if ~condition ~consequence true))

