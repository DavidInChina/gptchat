package kb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;

/* renamed from: kb.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4213G {

    /* renamed from: a  reason: collision with root package name */
    public final List f37237a;

    /* renamed from: b  reason: collision with root package name */
    public final int f37238b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f37239c;

    public C4213G(int i10, List list, boolean z10) {
        AbstractC3557B.c0("imageSelections", list);
        this.f37237a = list;
        this.f37238b = i10;
        this.f37239c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4213G)) {
            return false;
        }
        C4213G c4213g = (C4213G) obj;
        if (AbstractC3557B.K(this.f37237a, c4213g.f37237a) && this.f37238b == c4213g.f37238b && this.f37239c == c4213g.f37239c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = ((this.f37237a.hashCode() * 31) + this.f37238b) * 31;
        if (this.f37239c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageSelectionState(imageSelections=");
        sb2.append(this.f37237a);
        sb2.append(", firstImageIndex=");
        sb2.append(this.f37238b);
        sb2.append(", isUploadedImage=");
        return AbstractC4194d.w(sb2, this.f37239c, Separators.RPAREN);
    }

    public /* synthetic */ C4213G() {
        this(0, kf.v.f37483Y, false);
    }
}
