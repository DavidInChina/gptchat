package De;

import io.ktor.utils.io.x;
import java.nio.charset.Charset;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public i f3589Y;

    /* renamed from: Z  reason: collision with root package name */
    public Charset f3590Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f3591h0;

    /* renamed from: i0  reason: collision with root package name */
    public x f3592i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f3593j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ i f3594k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f3595l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f3594k0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f3593j0 = obj;
        this.f3595l0 |= Integer.MIN_VALUE;
        return this.f3594k0.a(null, null, null, this);
    }
}
