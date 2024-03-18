package Z1;

import a1.C1915c;
import android.content.Context;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Z1.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1765h0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Context f22970Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f22971Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f22972h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1915c f22973i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f22974j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1765h0(C1915c c1915c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22973i0 = c1915c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22972h0 = obj;
        this.f22974j0 |= Integer.MIN_VALUE;
        return this.f22973i0.r(null, 0, this);
    }
}
