-- data.sql
-- Inserta productos de ejemplo en la tabla products (ProductEntity)
INSERT INTO products (id,name, description, price, image) VALUES
  (1,'Mouse Inalámbrico', 'Mouse ergonómico inalámbrico con sensor óptico 1600 DPI', 18.99, 'https://example.com/images/mouse.jpg'),
  (2,'Teclado Mecánico', 'Teclado RGB con switches azules, estructura metálica', 69.50, 'https://example.com/images/keyboard.jpg'),
  (3,'Auriculares Bluetooth', 'Auriculares con cancelación de ruido, 20h de batería', 89.00, 'https://example.com/images/headphones.jpg'),
  (4,'Monitor 24" Full HD', 'Monitor IPS 24 pulgadas 1920x1080 con ajuste de altura', 149.90, 'https://example.com/images/monitor24.jpg'),
  (5,'Webcam HD 1080p', 'Cámara web 1080p con micrófono integrado y autofoco', 39.90, 'https://example.com/images/webcam.jpg'),
  (6,'SSD 1TB', 'Disco sólido NVMe M.2 1TB, lectura 3400MB/s', 99.99, 'https://example.com/images/ssd1tb.jpg'),
  (7,'Soporte Laptop', 'Base portátil con ventilador y altura regulable', 34.95, 'https://example.com/images/laptopstand.jpg');

-- Si quieres limpiar antes (opcional)
-- DELETE FROM products;