(ns me.chptx.reagent-bs.macros)

(def bs-classes
  '[Accordion
    Affix
    AffixMixin
    Alert
    BootstrapMixin
    Badge
    Button
    ButtonGroup
    ButtonToolbar
    Carousel
    CarouselItem
    Col
    CollapsableMixin
    DropdownButton
    DropdownMenu
    DropdownStateMixin
    FadeMixin
    Glyphicon
    Grid
    Input
    Interpolate
    Jumbotron
    Label
    ListGroup
    ListGroupItem
    MenuItem
    Modal
    Nav
    Navbar
    NavItem
    ModalTrigger
    OverlayTrigger
    OverlayMixin
    PageHeader
    Panel
    PanelGroup
    PageItem
    Pager
    Popover
    ProgressBar
    Row
    SplitButton
    SubNav
    TabbedArea
    Table
    TabPane
    Tooltip
    Well])

(defn bsreact-import [tname]
  `(def ~tname (aget js/ReactBootstrap ~(name tname))))

(defmacro export-bs-react-classes []
  `(do ~@(map bsreact-import bs-classes)))

