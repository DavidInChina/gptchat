package O9;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: O9.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1098d extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ EnumC1098d[] f13527Y;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC1098d[] enumC1098dArr = {new Enum("Text", 0), new Enum("ExecutionOutput", 1), new Enum("Code", 2), new Enum("MultimodalText", 3), new Enum("TetherBrowsingCode", 4), new Enum("SystemError", 5), new Enum("ModelEditableContext", 6), new Enum(SIPHeaderNames.UNSUPPORTED, 7)};
        f13527Y = enumC1098dArr;
        AbstractC3557B.C0(enumC1098dArr);
    }

    public static EnumC1098d valueOf(String str) {
        return (EnumC1098d) Enum.valueOf(EnumC1098d.class, str);
    }

    public static EnumC1098d[] values() {
        return (EnumC1098d[]) f13527Y.clone();
    }
}
