package a;

import android.gov.nist.core.Separators;

/* renamed from: a.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1887g extends Exception {
    public C1887g(String str, ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        super(arrayIndexOutOfBoundsException.getMessage() + Separators.SEMICOLON + str);
    }
}
