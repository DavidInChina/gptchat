package Uc;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: Uc.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1423h extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public static final C1423h f17677i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final List f17678j = AbstractC4344b.G0(r9.y.N0(ParameterNames.ID, C1417b.f17652p0), r9.y.N0("encodedFileId", C1417b.f17653q0), r9.y.N0("title", C1417b.f17654r0));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1423h)) {
            return false;
        }
        C1423h c1423h = (C1423h) obj;
        return true;
    }

    public final int hashCode() {
        return 151742024;
    }

    @Override // Ad.l
    public final List n0() {
        return f17678j;
    }

    public final String toString() {
        return "ConversationCsvAttachment";
    }

    @Override // Ad.l
    public final String x0() {
        return "conversation/attachment/csv?id={id}&title={title}&encodedFileId={encodedFileId}";
    }
}
