
package local;

public class Ordered extends AbstractEvent {

    private Long id;
    private Long ProductID;
    private Integer qty;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getProductId() {
        return ProductID;
    }

    public void setProductId(Long ProductID) {
        this.ProductID = ProductID;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    // 추가
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
