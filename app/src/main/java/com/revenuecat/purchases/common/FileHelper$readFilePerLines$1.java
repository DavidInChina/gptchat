package com.revenuecat.purchases.common;

import id.AbstractC3557B;
import j$.io.BufferedReaderRetargetClass;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/BufferedReader;", "bufferedReader", "Ljf/y;", "invoke", "(Ljava/io/BufferedReader;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class FileHelper$readFilePerLines$1 extends o implements k {
    final /* synthetic */ k $streamBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileHelper$readFilePerLines$1(k kVar) {
        super(1);
        this.$streamBlock = kVar;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BufferedReader) obj);
        return y.f36177a;
    }

    public final void invoke(BufferedReader bufferedReader) {
        AbstractC3557B.c0("bufferedReader", bufferedReader);
        k kVar = this.$streamBlock;
        Stream lines = BufferedReaderRetargetClass.lines(bufferedReader);
        AbstractC3557B.b0("bufferedReader.lines()", lines);
        kVar.invoke(lines);
    }
}
