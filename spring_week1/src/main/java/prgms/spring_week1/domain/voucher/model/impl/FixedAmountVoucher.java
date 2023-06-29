package prgms.spring_week1.domain.voucher.model.impl;

import prgms.spring_week1.domain.voucher.model.Voucher;
import prgms.spring_week1.domain.voucher.model.type.VoucherType;

import java.util.UUID;

public class FixedAmountVoucher extends Voucher {
    public FixedAmountVoucher(UUID voucherId, VoucherType voucherType, long discount) {
        super(voucherId, voucherType, discount);
    }
}

