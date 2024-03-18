package com.revenuecat.purchases.google.usecase;

import K4.q;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LK4/q;", "it", "", "invoke", "(LK4/q;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class QueryProductDetailsUseCase$onOk$1 extends o implements k {
    public static final QueryProductDetailsUseCase$onOk$1 INSTANCE = new QueryProductDetailsUseCase$onOk$1();

    public QueryProductDetailsUseCase$onOk$1() {
        super(1);
    }

    public final CharSequence invoke(q qVar) {
        AbstractC3557B.c0("it", qVar);
        String qVar2 = qVar.toString();
        AbstractC3557B.b0("it.toString()", qVar2);
        return qVar2;
    }
}
