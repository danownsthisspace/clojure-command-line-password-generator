(ns onthecodeagain.clipboard)

(import [java.awt.datatransfer StringSelection])

(defn ^sun.lwawt.macosx.CClipboard get-clipboard []
  (-> (java.awt.Toolkit/getDefaultToolkit)
      (.getSystemClipboard)))

(defn copy [text]
  (let [^java.awt.datatransfer.StringSelection selection (StringSelection. text)]
    (.setContents (get-clipboard) selection selection)))
