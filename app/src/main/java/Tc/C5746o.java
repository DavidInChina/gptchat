package tc;

import ah.AbstractC1998i;

@AbstractC1998i
/* renamed from: tc.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5746o {
    public static final C5745n Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f46092a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46093b;

    /* renamed from: c  reason: collision with root package name */
    public final String f46094c;

    /* renamed from: d  reason: collision with root package name */
    public final String f46095d;

    /* renamed from: e  reason: collision with root package name */
    public final String f46096e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f46097f;

    /* renamed from: g  reason: collision with root package name */
    public final String f46098g;

    public C5746o(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, String str6) {
        if (63 == (i10 & 63)) {
            this.f46092a = str;
            this.f46093b = str2;
            this.f46094c = str3;
            this.f46095d = str4;
            this.f46096e = str5;
            this.f46097f = z10;
            if ((i10 & 64) == 0) {
                this.f46098g = null;
                return;
            } else {
                this.f46098g = str6;
                return;
            }
        }
        R4.b.e2(i10, 63, C5744m.f46091b);
        throw null;
    }
}
