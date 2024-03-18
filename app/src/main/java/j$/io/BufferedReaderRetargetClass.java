package j$.io;

import j$.util.Spliterators;
import j$.util.stream.AbstractC3855y0;
import j$.util.stream.Stream;
import java.io.BufferedReader;

/* loaded from: classes3.dex */
public final /* synthetic */ class BufferedReaderRetargetClass {
    public static Stream lines(BufferedReader bufferedReader) {
        return AbstractC3855y0.H0(Spliterators.n(new a(bufferedReader)), false);
    }
}
