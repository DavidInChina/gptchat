package wb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import rb.C5424n;

/* renamed from: wb.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6157b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f48282Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f48283Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5424n f48284h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6157b(C5424n c5424n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f48284h0 = c5424n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f48282Y = obj;
        this.f48283Z |= Integer.MIN_VALUE;
        return this.f48284h0.c(null, this);
    }
}
