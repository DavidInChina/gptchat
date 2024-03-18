package di;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class l extends Zh.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f28596e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f28597f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f28598g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, t tVar, int i10, int i11) {
        super(str, true);
        this.f28596e = tVar;
        this.f28597f = i10;
        this.f28598g = i11;
    }

    @Override // Zh.a
    public final long a() {
        int i10 = this.f28597f;
        int i11 = this.f28598g;
        t tVar = this.f28596e;
        tVar.getClass();
        try {
            tVar.f28625D0.m(i10, i11, true);
            return -1L;
        } catch (IOException e10) {
            tVar.h(e10);
            return -1L;
        }
    }
}
