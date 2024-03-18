package ji;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Map;
import kf.AbstractC4268D;

/* renamed from: ji.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4140o {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f36729a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f36730b;

    /* renamed from: c  reason: collision with root package name */
    public final C4113B f36731c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f36732d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f36733e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f36734f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f36735g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f36736h;

    public C4140o(boolean z10, boolean z11, C4113B c4113b, Long l10, Long l11, Long l12, Long l13, Map map) {
        AbstractC3557B.c0("extras", map);
        this.f36729a = z10;
        this.f36730b = z11;
        this.f36731c = c4113b;
        this.f36732d = l10;
        this.f36733e = l11;
        this.f36734f = l12;
        this.f36735g = l13;
        this.f36736h = AbstractC4268D.l1(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f36729a) {
            arrayList.add("isRegularFile");
        }
        if (this.f36730b) {
            arrayList.add("isDirectory");
        }
        Long l10 = this.f36732d;
        if (l10 != null) {
            arrayList.add("byteCount=" + l10);
        }
        Long l11 = this.f36733e;
        if (l11 != null) {
            arrayList.add("createdAt=" + l11);
        }
        Long l12 = this.f36734f;
        if (l12 != null) {
            arrayList.add("lastModifiedAt=" + l12);
        }
        Long l13 = this.f36735g;
        if (l13 != null) {
            arrayList.add("lastAccessedAt=" + l13);
        }
        Map map = this.f36736h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return kf.t.m2(arrayList, ", ", "FileMetadata(", Separators.RPAREN, null, 56);
    }

    public /* synthetic */ C4140o(boolean z10, boolean z11, C4113B c4113b, Long l10, Long l11, Long l12, Long l13) {
        this(z10, z11, c4113b, l10, l11, l12, l13, kf.w.f37484Y);
    }
}
