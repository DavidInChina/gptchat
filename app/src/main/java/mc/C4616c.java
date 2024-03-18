package mc;

import Vc.A;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: mc.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4616c {
    public static final C4615b Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f39124e = {null, null, P4.a.E("com.openai.network.VoiceApiHost", A.values()), null};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f39125a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f39126b;

    /* renamed from: c  reason: collision with root package name */
    public final A f39127c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f39128d;

    public C4616c(boolean z10, boolean z11, A a5, boolean z12) {
        AbstractC3557B.c0("voiceApiHost", a5);
        this.f39125a = z10;
        this.f39126b = z11;
        this.f39127c = a5;
        this.f39128d = z12;
    }

    public static C4616c a(C4616c c4616c, boolean z10, boolean z11, A a5, boolean z12, int i10) {
        if ((i10 & 1) != 0) {
            z10 = c4616c.f39125a;
        }
        if ((i10 & 2) != 0) {
            z11 = c4616c.f39126b;
        }
        if ((i10 & 4) != 0) {
            a5 = c4616c.f39127c;
        }
        if ((i10 & 8) != 0) {
            z12 = c4616c.f39128d;
        }
        c4616c.getClass();
        AbstractC3557B.c0("voiceApiHost", a5);
        return new C4616c(z10, z11, a5, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4616c)) {
            return false;
        }
        C4616c c4616c = (C4616c) obj;
        if (this.f39125a == c4616c.f39125a && this.f39126b == c4616c.f39126b && this.f39127c == c4616c.f39127c && this.f39128d == c4616c.f39128d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 1237;
        if (this.f39125a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i13 = i10 * 31;
        if (this.f39126b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int hashCode = (this.f39127c.hashCode() + ((i13 + i11) * 31)) * 31;
        if (this.f39128d) {
            i12 = 1231;
        }
        return hashCode + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeveloperSettings(useApiStaging=");
        sb2.append(this.f39125a);
        sb2.append(", useAuth0Staging=");
        sb2.append(this.f39126b);
        sb2.append(", voiceApiHost=");
        sb2.append(this.f39127c);
        sb2.append(", noNewChatTitle=");
        return AbstractC4194d.w(sb2, this.f39128d, Separators.RPAREN);
    }

    public C4616c(int i10, boolean z10, boolean z11, A a5, boolean z12) {
        if ((i10 & 1) == 0) {
            this.f39125a = false;
        } else {
            this.f39125a = z10;
        }
        if ((i10 & 2) == 0) {
            this.f39126b = false;
        } else {
            this.f39126b = z11;
        }
        if ((i10 & 4) == 0) {
            this.f39127c = A.f18524Z;
        } else {
            this.f39127c = a5;
        }
        if ((i10 & 8) == 0) {
            this.f39128d = false;
        } else {
            this.f39128d = z12;
        }
    }
}
