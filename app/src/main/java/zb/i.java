package Zb;

import ah.AbstractC1998i;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class i {
    public static final h Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f23656e = {l.Companion.serializer(), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final l f23657a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23658b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23659c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23660d;

    public i(int i10, l lVar, String str, String str2, String str3) {
        if (1 == (i10 & 1)) {
            this.f23657a = lVar;
            if ((i10 & 2) == 0) {
                this.f23658b = null;
            } else {
                this.f23658b = str;
            }
            if ((i10 & 4) == 0) {
                this.f23659c = null;
            } else {
                this.f23659c = str2;
            }
            if ((i10 & 8) == 0) {
                this.f23660d = null;
                return;
            } else {
                this.f23660d = str3;
                return;
            }
        }
        R4.b.e2(i10, 1, g.f23655b);
        throw null;
    }
}
