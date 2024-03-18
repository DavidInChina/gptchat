package android.gov.nist.javax.sdp.fields;

import java.util.Arrays;

/* loaded from: classes.dex */
class Indentation {
    private int indentation;

    public Indentation() {
        this.indentation = 0;
    }

    public void decrement() {
        this.indentation--;
    }

    public int getCount() {
        return this.indentation;
    }

    public String getIndentation() {
        char[] cArr = new char[this.indentation];
        Arrays.fill(cArr, ' ');
        return new String(cArr);
    }

    public void increment() {
        this.indentation++;
    }

    public void setIndentation(int i10) {
        this.indentation = i10;
    }

    public Indentation(int i10) {
        this.indentation = i10;
    }
}
