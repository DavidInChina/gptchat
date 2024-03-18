package bi;

import H0.C0672c0;
import java.text.DateFormat;

/* renamed from: bi.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2228c {

    /* renamed from: a  reason: collision with root package name */
    public static final C0672c0 f26021a = new C0672c0(9);

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f26022b;

    /* renamed from: c  reason: collision with root package name */
    public static final DateFormat[] f26023c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f26022b = strArr;
        f26023c = new DateFormat[strArr.length];
    }
}
