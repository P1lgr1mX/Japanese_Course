package com.center.controller;

import com.center.model.BaiTap;
import com.center.service.BaiTapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/baitap")
public class BaiTapController {

    @Autowired
    private BaiTapService baiTapService;

    @GetMapping
    public List<BaiTap> getAllBaiTap() {
        return baiTapService.findAll();
    }

    @PostMapping
    public BaiTap createBaiTap(@RequestBody BaiTap baiTap) {
        return baiTapService.save(baiTap);
    }

    @GetMapping("/{id}")
    public BaiTap getBaiTapById(@PathVariable String id) {
        return baiTapService.findById(id);
    }

    @PutMapping("/{id}")
    public BaiTap updateBaiTap(@PathVariable String id, @RequestBody BaiTap baiTapDetails) {
        BaiTap baiTap = baiTapService.findById(id);
        if (baiTap != null) {
            baiTap.setTenBT(baiTapDetails.getTenBT());
            baiTap.setLoaiBT(baiTapDetails.getLoaiBT());
            baiTap.setHanNop(baiTapDetails.getHanNop());
            baiTap.setDiemThuong(baiTapDetails.getDiemThuong());
            baiTap.setDiemPhat(baiTapDetails.getDiemPhat());
            baiTap.setLopHoc(baiTapDetails.getLopHoc());
            return baiTapService.save(baiTap);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteBaiTap(@PathVariable String id) {
        baiTapService.deleteById(id);
    }
}
