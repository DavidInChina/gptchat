package ea;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: ea.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2824c {
    public static final C2823b Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f29099c = {null, new C2695d(u0.f28491a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f29100a;

    /* renamed from: b  reason: collision with root package name */
    public final List f29101b;

    public C2824c(int i10, String str, List list) {
        if (2 == (i10 & 2)) {
            if ((i10 & 1) == 0) {
                this.f29100a = null;
            } else {
                this.f29100a = str;
            }
            this.f29101b = list;
            return;
        }
        R4.b.e2(i10, 2, C2822a.f29098b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2824c)) {
            return false;
        }
        C2824c c2824c = (C2824c) obj;
        if (AbstractC3557B.K(this.f29100a, c2824c.f29100a) && AbstractC3557B.K(this.f29101b, c2824c.f29101b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f29100a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f29101b.hashCode() + (i10 * 31);
    }

    public final String toString() {
        return "DalleRequest(size=" + this.f29100a + ", prompts=" + this.f29101b + Separators.RPAREN;
    }
}
