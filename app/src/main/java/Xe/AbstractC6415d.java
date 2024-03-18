package xe;

import android.gov.nist.core.Separators;

/* renamed from: xe.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6415d {

    /* renamed from: a  reason: collision with root package name */
    public static final C6417f f49882a = new C6417f("multipart", "form-data");

    static {
        new C6417f("multipart", Separators.STAR);
        new C6417f("multipart", "mixed");
        new C6417f("multipart", "alternative");
        new C6417f("multipart", "related");
        new C6417f("multipart", "signed");
        new C6417f("multipart", "encrypted");
        new C6417f("multipart", "byteranges");
    }
}
