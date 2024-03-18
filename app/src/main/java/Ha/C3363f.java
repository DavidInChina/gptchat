package ha;

import Df.AbstractC0405d;
import ah.AbstractC1998i;
import ah.C1996g;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: ha.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3363f {
    public static final C3362e Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f32061d;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC3371n f32062a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f32063b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f32064c;

    /* JADX WARN: Type inference failed for: r4v0, types: [ha.e, java.lang.Object] */
    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f32061d = new KSerializer[]{new C1996g("com.openai.feature.conversations.domain.metadata.CitationLink", d10.b(AbstractC3371n.class), new AbstractC0405d[]{d10.b(C3367j.class), d10.b(C3370m.class)}, new KSerializer[]{C3365h.f32066a, C3368k.f32069a}, new Annotation[0]), null, null};
    }

    public C3363f(int i10, AbstractC3371n abstractC3371n, Integer num, Integer num2) {
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, C3361d.f32060b);
            throw null;
        }
        this.f32062a = abstractC3371n;
        if ((i10 & 2) == 0) {
            this.f32063b = null;
        } else {
            this.f32063b = num;
        }
        if ((i10 & 4) == 0) {
            this.f32064c = null;
        } else {
            this.f32064c = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3363f)) {
            return false;
        }
        C3363f c3363f = (C3363f) obj;
        if (AbstractC3557B.K(this.f32062a, c3363f.f32062a) && AbstractC3557B.K(this.f32063b, c3363f.f32063b) && AbstractC3557B.K(this.f32064c, c3363f.f32064c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        AbstractC3371n abstractC3371n = this.f32062a;
        if (abstractC3371n == null) {
            i10 = 0;
        } else {
            i10 = abstractC3371n.hashCode();
        }
        int i13 = i10 * 31;
        Integer num = this.f32063b;
        if (num == null) {
            i11 = 0;
        } else {
            i11 = num.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Integer num2 = this.f32064c;
        if (num2 != null) {
            i12 = num2.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "Citation(link=" + this.f32062a + ", startToken=" + this.f32063b + ", endToken=" + this.f32064c + Separators.RPAREN;
    }

    public C3363f(AbstractC3371n abstractC3371n, Integer num, Integer num2) {
        this.f32062a = abstractC3371n;
        this.f32063b = num;
        this.f32064c = num2;
    }
}
