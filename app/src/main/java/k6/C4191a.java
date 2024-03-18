package k6;

import id.AbstractC3557B;

/* renamed from: k6.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4191a implements i6.h {

    /* renamed from: a  reason: collision with root package name */
    public final i6.h[] f37105a;

    public C4191a(i6.h... hVarArr) {
        this.f37105a = hVarArr;
    }

    @Override // i6.h
    public final void a(String str, boolean z10) {
        AbstractC3557B.c0("sessionId", str);
        for (i6.h hVar : this.f37105a) {
            hVar.a(str, z10);
        }
    }
}
