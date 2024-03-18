package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.o;
import r9.y;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/Package;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class Offering$sixMonth$2 extends o implements AbstractC6216a {
    final /* synthetic */ Offering this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Offering$sixMonth$2(Offering offering) {
        super(0);
        this.this$0 = offering;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Package mo122invoke() {
        Package findPackage;
        findPackage = this.this$0.findPackage(PackageType.SIX_MONTH);
        return findPackage;
    }
}
