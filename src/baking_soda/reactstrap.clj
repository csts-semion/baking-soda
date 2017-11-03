(ns baking-soda.reactstrap
  (:require [clojure.string :as str]))


(def reactstrap-tags
  '[Alert
    Badge
    Breadcrumb
    BreadcrumbItem
    Button
    ButtonDropdown
    ButtonGroup
    ButtonToolbar
    Card
    CardBlock
    CardBody
    CardColumns
    CardDeck
    CardFooter
    CardGroup
    CardHeader
    CardImg
    CardImgOverlay
    CardLink
    CardSubtitle
    CardText
    CardTitle
    Carousel
    CarouselCaption
    CarouselControl
    CarouselIndicators
    CarouselItem
    Col
    Collapse
    Container
    CustomInput
    Dropdown
    DropdownItem
    DropdownMenu
    DropdownToggle
    Fade
    Form
    FormFeedback
    FormGroup
    FormText
    Input
    InputGroup
    InputGroupAddon
    InputGroupButton
    InputGroupButtonDropdown
    InputGroupText
    Jumbotron
    Label
    ListGroup
    ListGroupItem
    ListGroupItemHeading
    ListGroupItemText
    Media
    Modal
    ModalBody
    ModalFooter
    ModalHeader
    Nav
    NavDropdown
    NavItem
    NavLink
    Navbar
    NavbarBrand
    NavbarToggler
    Pagination
    PaginationItem
    PaginationLink
    Popover
    PopoverBody
    PopoverContent
    PopoverHeader
    PopoverTitle
    PopperContent
    PopperTargetHelper
    Progress
    Row
    TabContent
    TabPane
    Table
    Tooltip
    UncontrolledAlert
    UncontrolledButtonDropdown
    UncontrolledCarousel
    UncontrolledDropdown
    UncontrolledNavDropdown
    UncontrolledTooltip
    ])

(defn camel->kebab
  "Converts CamelCase / camelCase to kebab-case"
  [tag]
  (->> tag
       name
       (re-seq #"\w[a-z]+")
       (map str/lower-case)
       (str/join "-")
       symbol))

(defn create-reactstrap-component [tag]
  `(def ~(camel->kebab tag)
     (reagent.core/adapt-react-class
      (aget js/Reactstrap ~(name tag)))))


(defmacro export-reactstrap-components []
  `(do ~@(map create-reactstrap-component
              reactstrap-tags)))
