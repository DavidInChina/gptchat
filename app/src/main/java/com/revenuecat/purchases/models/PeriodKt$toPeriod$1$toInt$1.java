package com.revenuecat.purchases.models;

import Lg.m;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import r9.y;
import wf.k;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<no name provided>", "", "part", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class PeriodKt$toPeriod$1$toInt$1 extends o implements k {
    public static final PeriodKt$toPeriod$1$toInt$1 INSTANCE = new PeriodKt$toPeriod$1$toInt$1();

    public PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    public final Integer invoke(String str) {
        AbstractC3557B.c0("part", str);
        Integer W12 = m.W1(Lg.o.X2(str));
        return Integer.valueOf(W12 != null ? W12.intValue() : 0);
    }
}
