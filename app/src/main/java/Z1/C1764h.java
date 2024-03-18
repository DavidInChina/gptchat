package Z1;

import android.content.Context;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Z1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1764h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f22964Y;

    /* renamed from: Z  reason: collision with root package name */
    public Context f22965Z;

    /* renamed from: h0  reason: collision with root package name */
    public X1.j f22966h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f22967i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1771m f22968j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f22969k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1764h(C1771m c1771m, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22968j0 = c1771m;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22967i0 = obj;
        this.f22969k0 |= Integer.MIN_VALUE;
        return this.f22968j0.a(null, null, this);
    }
}
