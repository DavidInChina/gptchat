package xe;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;

/* renamed from: xe.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6414c {

    /* renamed from: a  reason: collision with root package name */
    public static final C6417f f49880a = new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "json");

    /* renamed from: b  reason: collision with root package name */
    public static final C6417f f49881b = new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "octet-stream");

    static {
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, Separators.STAR);
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "atom+xml");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "cbor");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "hal+json");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "javascript");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "rss+xml");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "xml");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "xml-dtd");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "zip");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "gzip");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "x-www-form-urlencoded");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "pdf");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.wordprocessingml.document");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.presentationml.presentation");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "protobuf");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "wasm");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "problem+json");
        new C6417f(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "problem+xml");
    }
}
