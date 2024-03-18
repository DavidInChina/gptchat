package E2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class F extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(int i10, String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        if (i10 == 4) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        } else if (i10 != 5) {
        } else {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    public /* synthetic */ F(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
